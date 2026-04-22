-- Create Users Table
CREATE TABLE IF NOT EXISTS TABLE_USERS (
    user_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) NOT NULL UNIQUE,
    email VARCHAR(100) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
    );


-- Create Tasks Table
CREATE TABLE IF NOT EXISTS TABLE_TASKS (
    task_id BIGINT AUTO_INCREMENT PRIMARY KEY,
    user_id BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    description TEXT,
    status VARCHAR(20) DEFAULT 'PENDING',
    CHECK (status IN ('PENDING', 'IN_PROGRESS', 'COMPLETED')),
    priority INT DEFAULT 2, -- 1: High, 2: Medium, 3: Low
    due_date DATE,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,

    -- Foreign Key Constraint
    CONSTRAINT fk_user
    FOREIGN KEY (user_id)
    REFERENCES TABLE_USERS(user_id)
    ON DELETE CASCADE
    );