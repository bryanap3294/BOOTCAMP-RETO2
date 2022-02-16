
INSERT INTO author (name,email,phone,age) VALUES ('bryan','bryan@gmail.com','999999999',25);
INSERT INTO author (name,email,phone,age) VALUES ('jordan','jorda@gmail.com','999999999',23);

INSERT INTO blog (name,description,url,status, author_id) VALUES ('BLOG1','BLOG1','www.blog1.com','activo',1);
INSERT INTO blog (name,description,url,status, author_id) VALUES ('BLOG2','BLOG2','www.blog2.com','activo',1);
INSERT INTO blog (name,description,url,status, author_id) VALUES ('BLOG3','BLOG3','www.blog3.com','inactivo',1);
INSERT INTO blog (name,description,url,status, author_id) VALUES ('BLOG4','BLOG4','www.blog4.com','activo',2);

INSERT INTO post (title,datess,status,content, blog_id) VALUES ('POST1','2020-01-30T11:00','PUBLICADO','ESTO ES UNA PRUEBA',1);
INSERT INTO post (title,datess,status,content, blog_id) VALUES ('POST2','2020-01-30T11:00','NOPUBLICADO','ESTO ES UNA PRUEBA',1);

INSERT INTO comment (datee,name,status, post_id) VALUES ('hoy','BRYAN','ACTIVO',1);


