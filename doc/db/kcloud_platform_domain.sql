create table if not exists public.boot_domain_event
(
	id           bigint generated by default as identity
		primary key,
	creator      bigint        default 0,
	editor       bigint        default 0,
	create_date  timestamp(6)  default CURRENT_TIMESTAMP not null,
	update_date  timestamp(6)  default CURRENT_TIMESTAMP not null,
	del_flag     smallint      default 0                 not null,
	version      integer       default 0                 not null,
	dept_id      bigint        default 0,
	dept_path    varchar(1000) default '0'::character varying,
	tenant_id    bigint        default 0,
	aggregate_id bigint,
	event_type   varchar(100)                            not null,
	topic        varchar(100)                            not null,
	source_name  varchar(20)                             not null,
	attribute    json,
	app_name     varchar(20)                             not null,
	tag          varchar(50)
);

comment on table public.boot_domain_event is '领域事件';

comment on column public.boot_domain_event.id is 'ID';

comment on column public.boot_domain_event.creator is '创建人';

comment on column public.boot_domain_event.editor is '编辑人';

comment on column public.boot_domain_event.create_date is '创建时间';

comment on column public.boot_domain_event.update_date is '修改时间';

comment on column public.boot_domain_event.del_flag is '删除标识 0未删除 1已删除';

comment on column public.boot_domain_event.version is '版本号';

comment on column public.boot_domain_event.dept_id is '部门ID';

comment on column public.boot_domain_event.dept_path is '部门PATH';

comment on column public.boot_domain_event.tenant_id is '租户ID';

comment on column public.boot_domain_event.aggregate_id is '聚合根ID';

comment on column public.boot_domain_event.event_type is '事件类型';

comment on column public.boot_domain_event.topic is 'MQ主题';

comment on column public.boot_domain_event.source_name is '数据源名称';

comment on column public.boot_domain_event.attribute is '扩展属性';

comment on column public.boot_domain_event.app_name is '应用名称';

comment on column public.boot_domain_event.tag is '标签';

alter table public.boot_domain_event
	owner to root;
