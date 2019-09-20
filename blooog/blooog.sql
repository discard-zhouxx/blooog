USE blooog;
CREATE TABLE post (
                      post_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                      post_type_id VARCHAR(32) NOT NULL,
                      title VARCHAR(32) NOT NULL,
                      post_time DATE NOT NULL,
                      update_time DATE,
                      content MEDIUMTEXT NOT NULL,
                      like_num INT NOT NULL,
                      dislike_num INT NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE post_type(
                          post_type_id TINYINT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                          post_type_name VARCHAR(16) NOT NULL DEFAULT '未命名'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE comment(
                        post_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                        comment_time DATE NOT NULL,
                        comment_list_id INT NOT NULL,
                        comment_content VARCHAR(500) NOT NULL,
                        reviewer VARCHAR(16) DEFAULT '匿名'
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE message_board(
                              message_id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
                              message_content VARCHAR(500) NOT NULL,
                              review_name VARCHAR(16) NOT NULL,
                              review_contact VARCHAR(50) NOT NULL
)ENGINE=InnoDB DEFAULT CHARSET=utf8;

CREATE TABLE blogger(
                        blogger_name VARCHAR(10) DEFAULT 'Van',
                        blogger_password VARCHAR(16) ,
                        blogger_address VARCHAR(50) ,
                        blogger_signature VARCHAR(100) , 
                        blogger_email VARCHAR(30)
)ENGINE=InnoDB DEFAULT CHARSET=utf8;