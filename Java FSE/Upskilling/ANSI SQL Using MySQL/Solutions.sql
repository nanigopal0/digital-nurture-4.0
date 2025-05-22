-- 1. User Upcoming Events 
-- Show a list of all upcoming events a user is registered for in their city, sorted by date. 

SELECT 
    U.user_id,
    U.full_name,
    U.email,
    U.city,
    Reg.registration_date,
    E.event_id,
    E.title,
    E.description,
    E.start_date,
    E.end_date,
    E.status,
    E.organizer_id
FROM
    registrations AS Reg
        JOIN
    Users AS U ON Reg.user_id = U.user_id
        JOIN
    Events AS E ON Reg.event_id = E.event_id
WHERE
    E.status = 'upcoming'
        AND E.city = U.city
ORDER BY E.start_date;

-- 2. Top Rated Events 
-- Identify events with the highest average rating, considering only those that have received at 
-- least 10 feedback submissions.

select e.event_id, avg(f.rating) from feedback f 
join events e on e.event_id = f.event_id
group by f.event_id
having count(f.event_id) >= 10
order by avg(f.rating) desc
limit 1;

-- 3. Inactive Users 
-- Retrieve users who have not registered for any events in the last 90 days.

SELECT u.user_id, u.full_name
FROM users u
WHERE NOT EXISTS (
    SELECT 1
    FROM registrations r
    WHERE r.user_id = u.user_id
      AND r.registration_date >= CURRENT_DATE - INTERVAL 90 DAY
);










