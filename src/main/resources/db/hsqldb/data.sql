----------- USER ADMIN ------------------
INSERT INTO users(username,password,enabled) VALUES ('admin1','admin1',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (1,'admin1','admin');

----------- USER MIEMBROS-----------
INSERT INTO users(username,password,enabled) VALUES ('miembro1','miembro1',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (2,'miembro1','miembro');
INSERT INTO users(username,password,enabled) VALUES ('miembro2','miembro2',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (3,'miembro2','miembro');
INSERT INTO users(username,password,enabled) VALUES ('miembro3','miembro3',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (4,'miembro3','miembro');
INSERT INTO users(username,password,enabled) VALUES ('miembro4','miembro4',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (5,'miembro4','miembro');
INSERT INTO users(username,password,enabled) VALUES ('miembro5','miembro5',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (6,'miembro5','miembro');

----------- USER MONITORES --------------------
INSERT INTO users(username,password,enabled) VALUES ('monitor1','monitor1',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (7,'monitor1','monitor');
INSERT INTO users(username,password,enabled) VALUES ('monitor2','monitor2',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (8,'monitor2','monitor');
INSERT INTO users(username,password,enabled) VALUES ('monitor3','monitor3',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (9,'monitor3','monitor');
INSERT INTO users(username,password,enabled) VALUES ('monitor4','monitor4',TRUE);
INSERT INTO authorities(id,username,authority) VALUES (10,'monitor4','monitor');

----------- ADMINISTRADOR --------------------

INSERT INTO administradores (id, nombre, apellidos, telefono, email, username) VALUES (1, 'Juan','Gutierrez', '654321123', 'JG@mail.com',  'admin1');

----------- MIEMBROS -------------------------

INSERT INTO miembros (id, nombre, apellidos, telefono, email, username,dni,direccion) VALUES (1, 'Pedro','Lopez', '654321123', 'PL@gymmail.com',  'miembro1','268475615L','Calle Falsa 123');
INSERT INTO miembros (id, nombre, apellidos, telefono, email, username,dni,direccion) VALUES (2, 'Margarita','Perez', '654321124', 'MP@gymmail.com',  'miembro2','246871569B','Calle Falsa 124');
INSERT INTO miembros (id, nombre, apellidos, telefono, email, username,dni,direccion) VALUES (3, 'Agustin','Martinez', '654321125', 'AM@gymmail.com',  'miembro3','216573948Z','Calle Falsa 125');
INSERT INTO miembros (id, nombre, apellidos, telefono, email, username,dni,direccion) VALUES (4, 'Maria','Rodriguez', '654321126', 'MR@gymmail.com',  'miembro4','257554987K','Calle Falsa 126');
INSERT INTO miembros (id, nombre, apellidos, telefono, email, username,dni,direccion) VALUES (5, 'Luisa','Sanchez', '654321127', 'LS@gymmail.com',  'miembro5','235644791Q','Calle Falsa 127');

----------- MONITORES ------------------------

INSERT INTO monitores (id, nombre, apellidos, telefono, email, username) VALUES (1, 'Juan','Gomez', '667421123', 'JG@gymmail.com',  'monitor1');
INSERT INTO monitores (id, nombre, apellidos, telefono, email, username) VALUES (2, 'Pilar','Narvaez', '667494423', 'PNA@gymmail.com',  'monitor2');
INSERT INTO monitores (id, nombre, apellidos, telefono, email, username) VALUES (3, 'Felipe','Estevez', '662841123', 'FE@gymmail.com',  'monitor3');
INSERT INTO monitores (id, nombre, apellidos, telefono, email, username) VALUES (4, 'Lourdes','Benitez', '664625123', 'LB@gymmail.com',  'monitor4');

----------- SEDES ----------------------------

INSERT INTO sedes (id, nombre, direccion, administrador_id) VALUES (1, 'GYM 1','Avenida de los Gimnasios 1',1);
INSERT INTO sedes (id, nombre, direccion, administrador_id) VALUES (2, 'GYM 2','Avenida de los Gimnasios 2',1);

----------- ACTIVIDADES -----------------------

INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (1, 'Spinning',0,1,1); 
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (2, 'Sesión Bíceps',0,1,1);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (3, 'Tenis',1,1,4);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (4, 'Sesión Abdominales',0,1,1);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (5, 'Yoga mañanero',3,1,3);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (6, 'Acuagym',2,1,2);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (7, 'Pilates',4,1,3);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (8, 'Sesión Piernas',0,1,1);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (9, 'Sesión Cardio',0,1,1);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (10, 'Carrera de obstáculos',5,1,1);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (11, 'Escalada',1,1,2);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (12, 'Natación',1,1,2);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (13, 'Fútbol',1,1,4);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (14, 'Aerobic Latino',2,1,3);
INSERT INTO actividades(id, descripcion, categoria, sede_id, monitor_id) VALUES (15, 'Yoga al atardecer',3,1,3);

----------- HORARIOS -------------------------
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (1,1,'07:30','08:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (2,1,'08:30','09:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (3,1,'09:30','10:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (4,1,'10:30','11:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (5,1,'11:30','12:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (6,1,'12:30','13:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (7,1,'13:30','14:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (8,1,'14:30','15:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (9,1,'15:30','16:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (10,1,'16:30','17:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (11,1,'17:30','18:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (12,1,'18:30','19:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (13,1,'19:30','20:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (14,1,'20:30','21:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (15,1,'21:30','22:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (16,2,'07:30','08:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (17,2,'08:30','09:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (18,2,'09:30','10:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (19,2,'10:30','11:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (20,2,'11:30','12:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (21,2,'12:30','13:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (22,2,'13:30','14:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (23,2,'14:30','15:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (24,2,'15:30','16:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (25,2,'16:30','17:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (26,2,'17:30','18:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (27,2,'18:30','19:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (28,2,'19:30','20:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (29,2,'20:30','21:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (30,2,'21:30','22:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (31,3,'07:30','08:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (32,3,'08:30','09:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (33,3,'09:30','10:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (34,3,'10:30','11:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (35,3,'11:30','12:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (36,3,'12:30','13:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (37,3,'13:30','14:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (38,3,'14:30','15:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (39,3,'15:30','16:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (40,3,'16:30','17:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (41,3,'17:30','18:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (42,3,'18:30','19:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (43,3,'19:30','20:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (44,3,'20:30','21:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (45,3,'21:30','22:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (46,4,'07:30','08:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (47,4,'08:30','09:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (48,4,'09:30','10:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (49,4,'10:30','11:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (50,4,'11:30','12:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (51,4,'12:30','13:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (52,4,'13:30','14:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (53,4,'14:30','15:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (54,4,'15:30','16:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (55,4,'16:30','17:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (56,4,'17:30','18:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (57,4,'18:30','19:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (58,4,'19:30','20:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (59,4,'20:30','21:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (60,4,'21:30','22:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (61,5,'07:30','08:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (62,5,'08:30','09:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (63,5,'09:30','10:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (64,5,'10:30','11:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (65,5,'11:30','12:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (66,5,'12:30','13:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (67,5,'13:30','14:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (68,5,'14:30','15:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (69,5,'15:30','16:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (70,5,'16:30','17:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (71,5,'17:30','18:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (72,5,'18:30','19:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (73,5,'19:30','20:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (74,5,'20:30','21:30');
INSERT INTO horarios(id,dia,hora_inicio,hora_fin) VALUES (75,5,'21:30','22:30');


----------- RELACION ACTIVIDADES - HORARIOS ------------------------------------


----------- EVENTOS ------------------------------------------------------------

INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (1,'Campeonato de Fútbol','Es un campeonato de fútbol', '2022-01-14','17:00','Pista de fútbol exterior',1);
INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (2,'Picnic y juegos en familia','Picnic para las familias de los miembros del gym', '2021-08-22','17:00','Parque de los Príncipes',1);
INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (3,'Competición de natación 200m','Competición de natación', '2022-01-09','17:00','Piscina olímpica',2);
INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (4,'Maratón solidario','Maratón solidario', '2021-12-24','12:00','Puerta de jerez',2);
INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (5,'Charla de nutrición con Carlos Ríos','Hablamos de comer bien', '2022-01-14','17:00','Sala de eventos 1',1);
INSERT INTO eventos(id, nombre, descripcion, fecha, hora, lugar, sede_id) VALUES (6,'Tai Chi al fresco','Practicaremos tai chi en el parque', '2022-04-24','12:00','Parque Alamillo',1);

----------- CURSOS ------------------------------------------------------------

INSERT INTO cursos(id, nombre, descripcion, fecha_comienzo, fecha_fin, horario_id, max_inscritos, sede_id, monitor_id) VALUES (1,'Curso de Mindfullnes','Es un curso para aprender a dejar la mente en blanco','2022-01-20','2022-02-20',55,30,1,2);
INSERT INTO cursos(id, nombre, descripcion, fecha_comienzo, fecha_fin, horario_id, max_inscritos, sede_id, monitor_id) VALUES (2,'Curso de Artes Marciales','Es un curso para dominar las artes marciales','2022-01-20','2022-06-20',71,20,1,1);
INSERT INTO cursos(id, nombre, descripcion, fecha_comienzo, fecha_fin, horario_id, max_inscritos, sede_id, monitor_id) VALUES (3,'Curso de Defensa Personal','Es un curso para aprender defenderte de una agresión','2022-05-20','2022-05-30',75,15,1,2);
INSERT INTO cursos(id, nombre, descripcion, fecha_comienzo, fecha_fin, horario_id, max_inscritos, sede_id, monitor_id) VALUES (4,'Curso de Escalada','Es un curso para aprender a escalar en rocódromo','2022-01-15','2022-06-20',41,10,1,4);