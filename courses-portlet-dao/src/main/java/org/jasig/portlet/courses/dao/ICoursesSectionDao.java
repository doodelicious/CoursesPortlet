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
package org.jasig.portlet.courses.dao;
import java.util.List;
import java.util.Map;
import javax.portlet.PortletRequest;
import org.jasig.portlet.courses.model.xml.TermList;
import org.jasig.portlet.courses.model.xml.personal.Course;
import org.jasig.portlet.courses.model.xml.personal.CoursesByTerm;
/**
 * ICoursesDao represents a data access interface for retrieving course and
 * grade data for a particular user.
 *
 * @author Jen Bourey, jennifer.bourey@gmail.com
 * @version $Revision$
 */
public interface ICoursesSectionDao {
    /**
     * Get a term list for the current user
     *
     * @param request
     * @return
     */
    public TermList getTermList(PortletRequest request);
    /**
     * Get courses for a term for the current user
     *
     * @param request
     * @return
     */
    public CoursesByTerm getCoursesByTerm(PortletRequest request, String termCode, TermList termList);
   public Course  getCoursesBySection(PortletRequest request, String termCode, String catalogNbr, String subjectCode,
                                                   String courseId,String classNbr, TermList termList);
    public List<Course>  getFinalExams(PortletRequest request, String termCode, TermList termList);
    public List<Course>  getClassSchedule(PortletRequest request, String termCode, TermList termList);
}