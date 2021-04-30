create database escuela
go
use escuela
go

create table curso (
    claveCurso char(7) not null,
    nombreCurso varchar(50) not null,
    unidades INT not null,
    departamento varchar(50),
    primary key (claveCurso));

create table estudiante (
    matricula char(9) not null,
    nombre varchar(50) not null,
    carrera varchar(4) DEFAULT 'ITC',
    primary key(matricula));
    
create table grupo (
    claveCurso char(7) not null,
    idGrupo char(1) not null,
    semestre char(6) not null,
    profesorNombre varchar(50) not null,
    primary key(claveCurso,idGrupo,semestre),
    foreign key(claveCurso) references curso(claveCurso));
    
create table integrante (
    claveCurso char(7) not null,
    idGrupo char(1) not null,
    semestre char(6) not null,
    matricula char(9) not null,
    calificacion int not null,
    primary key(claveCurso,idGrupo,semestre,matricula),
    foreign key(claveCurso,idGrupo,semestre) references grupo(claveCurso,idGrupo,semestre));
    
create table prerequisito (
   claveCurso char(7) not null,
   clavePrerequisito char(7) not null,
   primary key(claveCurso,clavePrerequisito), 
   foreign key(claveCurso) references curso(claveCurso),
   foreign key(clavePrerequisito) references curso(claveCurso));

insert into curso values('Cb00005','Bases de datos para el soporte de decisiones',8,'computo');
insert into curso values('Cb00801','Introducción a la comutación',8,'computo');
insert into curso values('Cb00853','Lenguajes de Programacion',8,'computo');
insert into curso values('Cb00861','Fundamentos de bases de datos',8,'computo');
insert into curso values('Ma00801','Matemáticas remediales',16,'matemáticas');
insert into curso values('MA0099','Mate',3,'matemáticas');

insert into estudiante values('372837','Roberto Rueda','LSCA');
insert into estudiante values('706393','Iván López','LSCA');
insert into estudiante values('710889','Jordi Sanz','LSCA');
insert into estudiante values('711196','Laura Nuñez','ISC');
insert into estudiante values('711750','Rafael Trejo','ISC');
insert into estudiante values('712851','Andrés Jaimes','ISC');
insert into estudiante values('715597','Nidia Julieta Salinas','LSCA');
insert into estudiante values('715629','Cecilia Gallarzo','LSCA');
insert into estudiante values('715753','Héctor Alonso Jiménez','ISC');
insert into estudiante values('715917','José Sanchez','ISC');

insert into grupo values('Cb00005','1','200213','Rafael Lozano');
insert into grupo values('Cb00801','1','200213','Abel Bueno');
insert into grupo values('Cb00861','1','200213','Abel Bueno');
insert into grupo values('Cb00861','2','200213','Javier Cartujano');
insert into grupo values('Ma00801','1','200213','Oscar Esperanza');

insert into integrante values('Cb00801','1','200213','372837',80);
insert into integrante values('Cb00801','1','200213','706393',65);
insert into integrante values('Cb00801','1','200213','710889',70);
insert into integrante values('Cb00861','1','200213','372837',70);
insert into integrante values('Cb00861','1','200213','715753',60);
insert into integrante values('Ma00801','1','200213','372837',90);
insert into integrante values('Ma00801','1','200213','715753',100);

insert into prerequisito values('Cb00005','Cb00801');
insert into prerequisito values('Cb00005','Ma00801');
insert into prerequisito values('Cb00853','Cb00005');
insert into prerequisito values('Cb00853','Cb00801');

