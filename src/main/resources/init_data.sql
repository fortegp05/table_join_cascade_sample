/* 座席データ */
INSERT INTO seats (seat) VALUES ('席1');
INSERT INTO seats (seat) VALUES ('席2');
INSERT INTO seats (seat) VALUES ('席3');
INSERT INTO seats (seat) VALUES ('席4');
INSERT INTO seats (seat) VALUES ('席5');

/* クラスデータ */
INSERT INTO classes (name) VALUES ('そら組');
INSERT INTO classes (name) VALUES ('うみ組');

/* 生徒データ */
INSERT INTO students (name, seats_id, class_id) VALUES ('一郎', 1, 1);
INSERT INTO students (name, seats_id, class_id) VALUES ('次郎', 2, 1);
INSERT INTO students (name, seats_id, class_id) VALUES ('三郎', 3, 1);
INSERT INTO students (name, seats_id, class_id) VALUES ('四郎', 4, 2);
INSERT INTO students (name, seats_id, class_id) VALUES ('五郎', 5, 2);

/* 先生データ */
INSERT INTO teachers (name) VALUES ('青森');
INSERT INTO teachers (name) VALUES ('秋田');
INSERT INTO teachers (name) VALUES ('山形');
INSERT INTO teachers (name) VALUES ('宮城');
INSERT INTO teachers (name) VALUES ('福島');
INSERT INTO teachers (name) VALUES ('岩手');

/* 担当教師と生徒 */
INSERT INTO courses (student_id, teacher_id) VALUES (1, 1);
INSERT INTO courses (student_id, teacher_id) VALUES (2, 1);
INSERT INTO courses (student_id, teacher_id) VALUES (2, 2);
INSERT INTO courses (student_id, teacher_id) VALUES (3, 1);
INSERT INTO courses (student_id, teacher_id) VALUES (3, 2);
INSERT INTO courses (student_id, teacher_id) VALUES (3, 3);
INSERT INTO courses (student_id, teacher_id) VALUES (4, 4);
INSERT INTO courses (student_id, teacher_id) VALUES (4, 5);
INSERT INTO courses (student_id, teacher_id) VALUES (4, 6);
INSERT INTO courses (student_id, teacher_id) VALUES (5, 4);
INSERT INTO courses (student_id, teacher_id) VALUES (5, 5);
INSERT INTO courses (student_id, teacher_id) VALUES (5, 6);