create table if not exists regularized_modular_versions(
module_identifier Integer not null,
modular_version_code varchar(255) null,
modular_version_header char null,
modular_version_config_id Integer null,
total_count varchar(255) null,
header_summary varchar(255) null,
json_as_format Integer null,
xml_as_format Integer null,
result_summary varchar(255) null,
data_count Integer null,
footer_available varchar(255) null,
default_sort varchar(255) null,
default_search varchar(255) null,
constraint regularized_modular_versions_pk primary key(module_identifier));