CREATE TABLE quotes
(
    id      INTEGER       NOT NULL AUTO_INCREMENT,
    author  VARCHAR(128)  NOT NULL,
    content VARCHAR(1024) NOT NULL,
    PRIMARY KEY (id)
);

insert into quotes (author, content)
values ('Brian Tracy',
        'The more credit you give away, the more will come back to you. The more you help others, the more they will want to help you.'),
       ('Steve Jobs',
        'My favorite things in life don’t cost any money. It’s really clear that the most precious resource we all have is time.')