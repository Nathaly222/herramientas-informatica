CREATE VIEW activity_view AS
    SELECT a.*, l.full_name
    FROM lead l JOIN activity a
        ON l.id = a.lead_id;