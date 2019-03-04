package com.drollsMbp.test;


import com.droolsMbp.model.Product;
import org.junit.Test;
import org.kie.api.KieServices;
import org.kie.api.io.ResourceType;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;
import org.kie.internal.KnowledgeBase;
import org.kie.internal.KnowledgeBaseFactory;
import org.kie.internal.builder.KnowledgeBuilder;
import org.kie.internal.builder.KnowledgeBuilderFactory;
import org.kie.internal.definition.KnowledgePackage;
import org.kie.internal.io.ResourceFactory;
import org.kie.internal.runtime.StatefulKnowledgeSession;

import java.util.Collection;

public class Drools5Test {

    public static void main(String[] args) {
        new Drools5Test().oldExecuteDrools();
    }


    private void oldExecuteDrools() {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add(ResourceFactory.newClassPathResource("com/rules/Rules.drl", this.getClass()), ResourceType.DRL);
        if (kbuilder.hasErrors()) {
            System.out.println(kbuilder.getErrors().toString());
        }
        Collection<KnowledgePackage> pkgs = kbuilder.getKnowledgePackages();
        KnowledgeBase kbase = KnowledgeBaseFactory.newKnowledgeBase();
        kbase.addKnowledgePackages(pkgs);

        StatefulKnowledgeSession ksession = kbase.newStatefulKnowledgeSession();

        Product p = new Product();
        p.setType(Product.DIAMOND);

        ksession.insert(p);
        ksession.fireAllRules();
        ksession.dispose();

        System.out.println("This product info :" + p);
    }


    @Test
    public void testRules() {
        KieServices ks = KieServices.get();
        KieContainer kc = ks.getKieClasspathContainer();
        KieSession kSession = kc.newKieSession("kession-rule");

        Product p = new Product();
        p.setType(Product.DIAMOND);

        kSession.insert(p);
        int count = kSession.fireAllRules();

        System.out.println("命中规则 :" + count);
        System.out.println("This product info :" + p);
    }

}
