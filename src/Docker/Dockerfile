FROM microsoft/mssql-server-linux:2017-latest
RUN mkdir -p /var/opt/mssql/backup
COPY AdventureWorks.bak /var/opt/mssql/backup
COPY escuela.sql /var/opt/mssql/backup
ENV ACCEPT_EULA=Y
ENV SA_PASSWORD=Compiladores@2021
ENV MSSQL_PID=Developer
#docker volume rm -f ...