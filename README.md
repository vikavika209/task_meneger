## Требования

- Docker
- Docker Compose
- Java 17 (или выше)

## Запуск проекта

Для удобства локального запуска проекта, мы используем Docker Compose. 

### 1. Клонируйте репозиторий

Сначала клонируйте репозиторий на свой локальный компьютер:

`git clone https://github.com/vikavika209/task_meneger_test_project.git
cd your-repository-directory`

### 2. Соберите и запустите контейнеры

`docker-compose up --build`

### 3. Подключение к базе данных

После того как контейнеры будут запущены, база данных PostgreSQL будет доступна через контейнер db на порту 5432.
