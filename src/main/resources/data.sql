create sequence user_id_seq start with 1 increment by 1;
create sequence project_id_seq start with 1 increment by 1;
create sequence task_id_seq start with 1 increment by 1;

-- id, name, email, created_at
INSERT INTO user VALUES -- user je napisany ako user lebo je to reserved keyword
(next value for user_id_seq, 'Jozko Mrkvicka', 'jozko.mrkvicka@gmail.com', CURRENT_TIMESTAMP),
(next value for user_id_seq, 'Maria Terezia', 'maria.terezia@gmail.com', CURRENT_TIMESTAMP);
-- id, user_id, name, description, created_at
INSERT INTO project VALUES
(next value for project_id_seq, 1, 'Jozkov projekt', 'Tasky v robote', CURRENT_TIMESTAMP),
(next value for project_id_seq, 2, 'Projekt Marie Terezie', 'Moj Todolist', CURRENT_TIMESTAMP);
-- id, user_id, project_id, name, description, status, created_at
INSERT INTO task VALUES
(next value for task_id_seq, 1, 1, 'Spravit API', 'API ma byt pre noveho klienta', 'DONE', CURRENT_TIMESTAMP),
(next value for task_id_seq, 1, 1, 'Otestovat API', 'Unit testy + integracne testy', 'NEW', CURRENT_TIMESTAMP),
(next value for task_id_seq, 2, 2, 'Kupit mame darcek', null, 'NEW', CURRENT_TIMESTAMP),
(next value for task_id_seq, 2, null, 'Zavolat do skoly', 'Cislo mam na vizitke riaditelky', 'NEW', CURRENT_TIMESTAMP);