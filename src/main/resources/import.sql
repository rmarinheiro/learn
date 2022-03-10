INSERT INTO tb_user (name, email, password) VALUES ('Alex', 'alex@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Joao', 'joao@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');
INSERT INTO tb_user (name, email, password) VALUES ('Maria', 'maria@gmail.com', '$2a$10$eACCYoNOHEqXve8aIWT8Nu3PkMXWBaOxJ9aORUYzfMQCbVBIhZ8tG');

INSERT INTO tb_role (authority) VALUES ('ROLE_STUDENT');
INSERT INTO tb_role (authority) VALUES ('ROLE_INSTRUCTOR');
INSERT INTO tb_role (authority) VALUES ('ROLE_ADMIN');

INSERT INTO tb_user_role (user_id, role_id) VALUES (1, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (2, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 1);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 2);
INSERT INTO tb_user_role (user_id, role_id) VALUES (3, 3);

INSERT INTO tb_course (name,img_Uri,img_Gray_Uri) values('Java', 'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg','https://cdn.pixabay.com/photo/2014/04/03/11/08/tea-311844_1280.png');

INSERT INTO tb_offer (edition,start_Moment,end_Moment,course_id) VALUES ('1.0',TIMESTAMP WITH TIME ZONE '2021-11-20T03:00:07Z',TIMESTAMP WITH TIME ZONE '2022-11-20T03:00:07Z',1);
INSERT INTO tb_offer (edition,start_Moment,end_Moment,course_id) VALUES ('2.0',TIMESTAMP WITH TIME ZONE '2021-12-20T03:00:07Z',TIMESTAMP WITH TIME ZONE '2022-12-20T03:00:07Z',1)

INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES('TRILHA JAVA','TRILHA BASICA DE JAVA',1, 'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',1,1)
INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES('FORUM','TIRE SUAS DUVIDAS',2, 'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',2,1);
INSERT INTO tb_resource(title,description,position,img_Uri,type,offer_id) VALUES('LIVES','LIVES EXCLUSIVAS',3, 'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',0,1);

INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES('CAPITULO 1','CAPITULO INICIAL',1,'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',1,NULL);
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES('CAPITULO 2','CAPITULO VAMOS CONTINUAR',2,'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',1,1);
INSERT INTO tb_section(title,description,position,img_Uri,resource_id,prerequisite_id) VALUES('CAPITULO 3','CAPITULO VAMOS FINALIZAR',3,'https://www.oracle.com/a/ocom/img/rc24-duke-java-mascot.jpg',1,2);

INSERT INTO tb_enrollment(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) VALUES(1,1,TIMESTAMP WITH TIME ZONE '2021-11-20T09:00:07Z',null,true,false);
INSERT INTO tb_enrollment(user_id,offer_id,enroll_Moment,refund_Moment,available,only_Update) VALUES(2,1,TIMESTAMP WITH TIME ZONE '2021-11-20T13:00:07Z',null,true,false);

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 01 do Capitulo 1',1,1);
INSERT INTO tb_content(text_content,video_Uri,id) VALUES ('Material de Apoio: abc','https://www.youtube.com',1);

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 02 do Capitulo 1',2,1);
INSERT INTO tb_content(text_content,video_Uri,id) VALUES ('Material de Apoio: abc','http://www.youtube.com',2);

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Aula 03 do Capitulo 1',3,1);
INSERT INTO tb_content(text_content,video_Uri,id) VALUES ('Material de Apoio: abc','http://www.youtube.com',3);

INSERT INTO tb_lesson(title,position,section_id) VALUES ('Tarefa do Capitulo 01',1,1);
INSERT INTO tb_task(id,description,question_Count,approval_Count,weight,due_Date) VALUES (4,'Fazer um trabalho',5,4,1.0,TIMESTAMP WITH TIME ZONE '2022-12-25T03:00:07Z');

INSERT INTO tb_lessons_done(lesson_id,user_id,offer_id) VALUES (1,1,1);
INSERT INTO tb_lessons_done(lesson_id,user_id,offer_id) VALUES (2,1,1);

INSERT INTO tb_notification(text,moment,read,route,user_id) VALUES('Tarefa a fazer',TIMESTAMP WITH TIME ZONE '2022-11-20T03:00:07Z',true,'Usuario 01',1);
INSERT INTO tb_delivery(uri,moment,feedback,correct_count,delivery_status,lesson_id,offer_id,user_id)VALUES('https://github.com/devsuperior/bds-dslearn',TIMESTAMP WITH TIME ZONE '2020-12-10T10:00:00Z',0,null,1,4,1,1);

