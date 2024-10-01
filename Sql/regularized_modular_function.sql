create table if not exists regularized_modular_function(
function_code varchar(255) not null,
function_name varchar(255) null,
module_parameters varchar(255) null,
serverless_module varchar(255) null,
lambda_name varchar(255) null,
environment_variables varchar(255) null,
system_variables varchar(255) null,
modular_test_data Integer null,
module_variable_prediction varchar(255) null,
valid_data_sample varchar(255) null,
module_state varchar(255) null,
constraint regularized_modular_function_pk primary key(function_code));