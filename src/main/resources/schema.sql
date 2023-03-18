create table timeline.post
(
	id bigint not null auto_increment,
	user_id bigint not null,
	contents varchar(2000),
	created_at timestamp default now(),
	updated_at timestamp,
	primary key(id)
);

create table timeline.user
(
	id bigint not null auto_increment,
	name varchar(2000),
	joined_at timestamp,
	primary key(id)
);

create table timeline.follow
(
	id bigint not null auto_increment,
	user_id bigint,
	follow_user_id bigint,
	primary key(id)
);

