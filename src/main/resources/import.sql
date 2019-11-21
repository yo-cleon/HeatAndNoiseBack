insert into users (name, password) values ('admin', 'admin');

insert into projects (name, description, create_at, active) values ('My House', 'Measures from my house','2019-08-13', true);
insert into projects (name, description, create_at, active) values ('Baco Project', 'Measures from another places', '2019-08-15', false);
insert into projects (name, description, create_at, active) values ('Restaurant Project', 'Measures from a restaurant', '2019-10-15', true);

insert into sensors (sensor_id, name, added, project_id) values ('68:C6:3A:99:3D:A3', 'Kitchen', '2019-08-13',1);
insert into sensors (sensor_id, name, added, project_id) values ('4A:C7:6C:D0:48:86', 'Hall', '2019-08-13',1);
insert into sensors (sensor_id, name, added, project_id) values ('F1:59:D1:72:3F:1B', 'Garage', '2019-08-13',2);
insert into sensors (sensor_id, name, added, project_id) values ('5A:CD:F0:84:A4:B1', 'Salon', '2019-08-15',2);
insert into sensors (sensor_id, name, added, project_id) values ('18:15:19:B0:A0:97', 'Bedrom', '2019-08-15',2);
insert into sensors (sensor_id, name, added, project_id) values ('10:94:FB:04:5C:14', 'Garage', '2019-08-16',1);

insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('68:C6:3A:99:3D:A3', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('68:C6:3A:99:3D:A3', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('68:C6:3A:99:3D:A3', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('5A:CD:F0:84:A4:B1', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('5A:CD:F0:84:A4:B1', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('18:15:19:B0:A0:97', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('18:15:19:B0:A0:97', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('18:15:19:B0:A0:97', '13-08-2019 00:00:00', 20.5, 80, 10);
insert into measures(sensor_id, taken, temperature, humidity, decibels) values ('18:15:19:B0:A0:97', '13-08-2019 00:00:00', 20.5, 80, 10);
