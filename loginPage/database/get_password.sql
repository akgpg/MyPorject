create or replace function get_password(email_id varchar2) return varchar2  is

cursor c_utl is 
select password 
from   user_table utl 
where  email = email_id
;
l_pass varchar2(30);

begin
 open  c_utl;
 fetch c_utl into l_pass;
 close c_utl;

 return l_pass;

 exception 
   when others
   then
   if c_utl%isopen then close c_utl; end if;
end;