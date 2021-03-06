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
package org.jasig.portlet.courses.util;

import java.math.BigInteger;
import java.util.Comparator;

import org.jasig.portlet.courses.model.xml.CourseSection;
import org.joda.time.DateTime;

public class CourseSectionCodeComparator implements Comparator<CourseSection> {
  public static final CourseSectionCodeComparator INSTANCE = new CourseSectionCodeComparator();


  @Override
  public int compare(CourseSection o1, CourseSection o2) {
    if (o1 == o2) {
      return 0;
    }
    if (o1 == null) {
      return -1;
    }
    if (o2 == null) {
      return 1;
    }

    //Code comparison
    if(o1.getCode() == o2.getCode()) return 0;
    if(null == o1.getCode()) return -1;
    if(null == o2.getCode()) return +1;
    return o1.getCode().compareTo(o2.getCode());
  }
}
