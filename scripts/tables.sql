-- Table: public.artistas

-- DROP TABLE IF EXISTS public.artistas;

CREATE TABLE IF NOT EXISTS public.artistas
(
    id bigint NOT NULL,
    tipo_ide character varying(5) COLLATE pg_catalog."default" NOT NULL,
    numero_ide character varying(20) COLLATE pg_catalog."default" NOT NULL,
    nombres character varying(30) COLLATE pg_catalog."default" NOT NULL,
    apellidos character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT artistas_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.artistas
    OWNER to postgres;

-- Table: public.museos

-- DROP TABLE IF EXISTS public.museos;

CREATE TABLE IF NOT EXISTS public.museos
(
    id bigint NOT NULL,
    nombre character varying(30) COLLATE pg_catalog."default" NOT NULL,
    pais character varying(30) COLLATE pg_catalog."default" NOT NULL,
    ciudad character varying(30) COLLATE pg_catalog."default" NOT NULL,
    direccion character varying(30) COLLATE pg_catalog."default" NOT NULL,
    CONSTRAINT museos_pkey PRIMARY KEY (id)
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.museos
    OWNER to postgres;

-- Table: public.obras

-- DROP TABLE IF EXISTS public.obras;

CREATE TABLE IF NOT EXISTS public.obras
(
    id bigint NOT NULL,
    nombre character varying(20) COLLATE pg_catalog."default" NOT NULL,
    pais character varying(30) COLLATE pg_catalog."default" NOT NULL,
    id_artista bigint NOT NULL,
    CONSTRAINT obras_pkey PRIMARY KEY (id),
    CONSTRAINT id_artista FOREIGN KEY (id_artista)
        REFERENCES public.artistas (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
        NOT VALID
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.obras
    OWNER to postgres;

-- Table: public.museos_x_obras

-- DROP TABLE IF EXISTS public.museos_x_obras;

CREATE TABLE IF NOT EXISTS public.museos_x_obras
(
    id_museo bigint NOT NULL,
    id_obra bigint NOT NULL,
    id bigint NOT NULL,
    CONSTRAINT museos_x_obras_pkey PRIMARY KEY (id),
    CONSTRAINT id_museo FOREIGN KEY (id_museo)
        REFERENCES public.museos (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION,
    CONSTRAINT id_obra FOREIGN KEY (id_obra)
        REFERENCES public.obras (id) MATCH SIMPLE
        ON UPDATE NO ACTION
        ON DELETE NO ACTION
)

TABLESPACE pg_default;

ALTER TABLE IF EXISTS public.museos_x_obras
    OWNER to postgres;