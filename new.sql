-- This is an important query used later to join with the accounts table 
SELECT
 		rowkey,  -- key used to join with account_id
Info.date,  -- date is in string format YYYY-MM-DD HH:MM:SS
Info.code  -- e.g., 'pub-###'

FROM  Publishers
