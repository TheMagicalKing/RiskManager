create table risktable
(
    id      int auto_increment
        primary key,
    Descrip varchar(255) null,
    Prob    int(101)     null,
    Conseq  int(101)     null,
    Expo    float        null
)
    comment 'Handles the main part of our Risks';

create index risktable_conshold_id_fk
    on risktable (Conseq);

create index risktable_probhold_id_fk
    on risktable (Prob);

INSERT INTO riskmanager.risktable (id, Descrip, Prob, Conseq, Expo) VALUES (1, 'Mik''s Bil bryder sammen', 10, 10, 100);
INSERT INTO riskmanager.risktable (id, Descrip, Prob, Conseq, Expo) VALUES (2, 'Miks mobil går død for strøm', 1, 2, 2);
INSERT INTO riskmanager.risktable (id, Descrip, Prob, Conseq, Expo) VALUES (4, '', null, null, null);
INSERT INTO riskmanager.risktable (id, Descrip, Prob, Conseq, Expo) VALUES (5, '', 0, 0, 0);
INSERT INTO riskmanager.risktable (id, Descrip, Prob, Conseq, Expo) VALUES (6, '', 0, 0, 0);