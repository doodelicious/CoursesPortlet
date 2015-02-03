/**
 * Licensed to Apereo under one or more contributor license
 * agreements. See the NOTICE file distributed with this work
 * for additional information regarding copyright ownership.
 * Apereo licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License.  You may obtain a
 * copy of the License at the following location:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.jasig.portlet.courses.model.wrapper;

import static org.junit.Assert.assertEquals;

import org.jasig.portlet.courses.model.xml.Term;
import org.jasig.portlet.courses.model.xml.TermList;
import org.jasig.portlet.courses.model.xml.personal.Course;
import org.jasig.portlet.courses.model.xml.personal.CoursesByTerm;
import org.junit.Test;

public class CourseSummaryWrapperTest {

    @Test
    public void testGetCurrentTerm() {

        TermList list = new TermList();
        
        Term term1 = new Term();
        term1.setCurrent(false);
        term1.setCode("term1");
        list.getTerms().add(term1);
        
        Term term2 = new Term();
        term2.setCurrent(true);
        term2.setCode("term2");
        list.getTerms().add(term2);

        Term term3 = new Term();
        term3.setCurrent(false);
        term3.setCode("term3");
        list.getTerms().add(term3);
        
        assertEquals("term2", list.getCurrentTerm().getCode());
    }
    
    @Test
    public void testGetCourse() {
        CoursesByTerm summary = new CoursesByTerm();
        
        Course course1 = new Course();
        course1.setCode("course1");
        summary.getCourses().add(course1);

        Course course2 = new Course();
        course2.setCode("course2");
        summary.getCourses().add(course2);
        
        assertEquals("course2", summary.getCourse("course2").getCode());
    }
    
}
