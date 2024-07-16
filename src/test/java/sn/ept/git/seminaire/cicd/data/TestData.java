package sn.ept.git.seminaire.cicd.data;

import org.apache.commons.lang3.RandomStringUtils;
import sn.ept.git.seminaire.cicd.utils.SizeMapping;

import java.time.Instant;
import java.util.UUID;

public class TestData {

    public TestData(){}

    public static final class Default {
        private Default() {
        }

        public static final String ID = UUID.randomUUID().toString();
        public static final Instant createdDate = Instant.now();
        public static final Instant lastModifiedDate = Instant.now();
        public static final int VERSION = 0;
        public static final String TITLE = RandomStringUtils.randomAlphanumeric((SizeMapping.Title.MIN + SizeMapping.Title.MAX) / 2);
        public static final String name = RandomStringUtils.randomAlphanumeric((SizeMapping.Name.MIN + SizeMapping.Name.MAX) / 2);
        public static final String DESCRIPTION = RandomStringUtils.randomAlphanumeric((SizeMapping.Description.MIN + SizeMapping.Description.MAX) / 2);
        public static final boolean NOTCOMPLETE = false;
    }


    public static final class Update {
        private Update(){}
        public static final UUID ID = UUID.randomUUID();
        public static final Instant createdDate = Instant.now();
        public static final Instant lastModifiedDate = Instant.now();
        public static final int VERSION = 2;
        public static final  String TITLE = RandomStringUtils.randomAlphanumeric( (SizeMapping.Title.MIN+SizeMapping.Title.MAX)/2);
        public static final  String name = RandomStringUtils.randomAlphanumeric( (SizeMapping.Name.MIN+SizeMapping.Name.MAX)/2);
        public static final  String DESCRIPTION=  RandomStringUtils.randomAlphanumeric( (SizeMapping.Description.MIN+SizeMapping.Description.MAX)/2);
    }

}
