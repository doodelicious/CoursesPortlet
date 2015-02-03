<%--

    Licensed to Apereo under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Apereo licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License.  You may obtain a
    copy of the License at the following location:

      http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on an
    "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied.  See the License for the
    specific language governing permissions and limitations
    under the License.

--%>

<%--

    Licensed to Jasig under one or more contributor license
    agreements. See the NOTICE file distributed with this work
    for additional information regarding copyright ownership.
    Jasig licenses this file to you under the Apache License,
    Version 2.0 (the "License"); you may not use this file
    except in compliance with the License. You may obtain a
    copy of the License at:

    http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing,
    software distributed under the License is distributed on
    an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
    KIND, either express or implied. See the License for the
    specific language governing permissions and limitations
    under the License.

--%>

<%@ include file="/WEB-INF/jsp/include.jsp"%>

<c:choose>
  <c:when
    test="${(selectedTerm.registered==true) and (fn:length(courseSummary.courses) > 0)}">
    <c:forEach items="${ courseSummary.courses }" var="course">
      <li>
        <div class="ui-grid-c ui-li-heading">
          <div class="ui-block-a"><strong>${ course.courseDepartment.name }
            &nbsp;${fn:trim(course.code)}</strong></div>
          <div class="ui-block-b">&nbsp;</div>
          <div class="ui-block-c">${ course.credits } cr</div>
          <div class="ui-block-d">${ not empty course.grade?course.grade:'-' }</div>
        </div>
        <p>${ course.title}</p>
      </li>
    </c:forEach>
  </c:when>
  <c:otherwise>
    <li>
      <h3><spring:message code="no.courses.message"  htmlEscape="false" arguments="${portletSessionScope.helpDeskURL}"/></h3>
    </li>
  </c:otherwise>
</c:choose>
