<h1> JAVA Fullstack CRUD Application</h1>
    <p>This is a simple CRUD application built using JavaScript, React, Java, Spring Boot, MySQL, and Docker.</p>

<h2>Technologies Used</h2>
       <ul>
        <li><strong>Frontend:</strong> JavaScript, React</li>
        <li><strong>Backend:</strong> Java, Spring Boot</li>
        <li><strong>Database:</strong> MySQL</li>
        <li><strong>Containerization:</strong> Docker</li>
    </ul>

   <h2>Getting Started</h2>
    <h3>Prerequisites</h3>
    <ul>
        <li>Docker and Docker Compose installed on your machine</li>
        <li>Node.js and npm (for the frontend)</li>
        <li>Java JDK 11 or higher (for the backend)</li>
    </ul>

  <h3>Clone the Repository</h3>
    <pre><code>git clone https://github.com/yourusername/crud-application.git</code></pre>

   <h3>Setup the Backend (Spring Boot)</h3>
    <p>Navigate to the backend directory:</p>
    <pre><code>cd crud-application/backend</code></pre>
    <p>Build the Spring Boot application:</p>
    <pre><code>./mvnw clean package</code></pre>

   <h3>Setup the Frontend (React)</h3>
    <p>Navigate to the frontend directory:</p>
    <pre><code>cd crud-application/frontend</code></pre>
    <p>Install the dependencies:</p>
    <pre><code>npm install</code></pre>
    <p>Start the React development server:</p>
    <pre><code>npm start</code></pre>

  <h3>Setup the Database (MySQL) with Docker</h3>
    <p>Navigate to the root directory of the project and run the following command to start the MySQL database and the Spring Boot application:</p>
    <pre><code>docker-compose up</code></pre>

  <p>This command will:</p>
    <ul>
        <li>Build and start a MySQL container</li>
        <li>Build and start the Spring Boot application in another container</li>
    </ul>
