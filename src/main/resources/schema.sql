create table timeline.post
(
	post_no bigint not null auto_increment,
	user_no bigint not null,
	contents varchar(2000),
	created_at timestamp default now(),
	updated_at timestamp,
	primary key(post_no)
);
