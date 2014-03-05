create table if not exists current_states (id smallint auto_increment primary key, state_code char(2), name varchar(50));
--insert into current_states(state_code, name) values('MA', 'Massachusetts');
--insert into current_states(id, state_code, name) values(2, 'NH', 'New Hampshire');
--insert into current_states(id, state_code, name) values(3, 'ME', 'Maine');
--insert into current_states(id, state_code, name) values(4, 'VT', 'Vermont');

create table if not exists article
                         (id int auto_increment primary key, 
                          title varchar(255),
                          content clob,
                          previewContent varchar(255),
                          clickCount int,
                          commentCount int,
                          publishDate datetime);
                          
insert into article(title,content,publishDate) values('hehe','aaaaaaaaa',now());
