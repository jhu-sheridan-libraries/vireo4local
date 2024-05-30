package org.tdl.vireo.model.formatter;

import java.util.HashMap;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import javax.persistence.Entity;

import org.tdl.vireo.model.FieldValue;
import org.tdl.vireo.model.Submission;
import org.tdl.vireo.model.export.enums.DSpaceMETSKey;
import org.thymeleaf.context.Context;

@Entity
public class DSpaceMetsJHUFormatter extends DSpaceMetsFormatter {

    public DSpaceMetsFormatter() {
        super();
        setName("DSpaceMETSJHU");
        HashMap<String, String> templates = new HashMap<String, String>();
        templates.put(DEFAULT_TEMPLATE_KEY, "dspace_mets_jhu");
        setTemplates(templates);
    }
}
