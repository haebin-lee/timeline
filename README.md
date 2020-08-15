## timeline
스프링 부트로 타임라인 API 만들기
- mybatis
- swagger.io
- log4jdbc

* t_user
<pre>
<code>
create table if not exists timeline.t_user
(
	user_no bigserial not null
		constraint t_user_pk
			primary key,
	user_name varchar default 128 not null,
	join_timestamp timestamp,
	is_deleted bpchar default 'F'::bpchar,
	insert_timestamp timestamp default now(),
	updated_timestamp timestamp
);

comment on table timeline.t_user is '사용자';

alter table timeline.t_user owner to haebinlee;
</code>
</pre>

* t_post 
<pre>
<code>
create table if not exists timeline.t_post
(
	post_no bigserial not null
		constraint t_post_pk
			primary key,
	user_no bigserial not null
		constraint t_post_t_user_user_no_fk
			references timeline.t_user,
	contents varchar(2000),
	is_deleted char default 'F'::bpchar,
	insert_timestamp timestamp default now(),
	updated_timestamp timestamp
);

comment on table timeline.t_post is '포스트';

alter table timeline.t_post owner to haebinlee;
</code>
</pre>

* t_follow
<pre>
<code>
create table timeline.t_follow
(
	follow_no bigserial not null
		constraint t_follow_pk
			primary key,
	user_no bigint not null
		constraint t_follow_t_user_user_no_fk
			references timeline.t_user,
	follow_user_no bigint not null
		constraint t_follow_t_user_user_no_fk_2
			references timeline.t_user,
	is_deleted bpchar default 'F'::bpchar,
	insert_timestamp timestamp default now(),
	updated_timestamp timestamp
);

comment on table timeline.t_follow is '팔로워';

alter table timeline.t_follow owner to haebinlee;
</code>
</pre>

