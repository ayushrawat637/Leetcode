select p.firstname,p.lastname,a.city,a.state 
from Person p
Left Join Address a 
On p.personid = a.personid;