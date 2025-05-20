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