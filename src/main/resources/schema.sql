CREATE TABLE IF NOT EXISTS Content (
    id INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20) NOT NULL,
    content_type VARCHAR(50) NOT NULL,
    date_created TIMESTAMP NOT NULL,
    date_updated TIMESTAMP,
    url VARCHAR(255),
    PRIMARY KEY (id)
    );

INSERT INTO Content(title,description,status,content_type,date_created)
VALUES ('My Spring Data Blog Post','A post about spring data','IDEA','ARTICLE',CURRENT_TIMESTAMP)