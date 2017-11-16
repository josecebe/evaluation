/*
 * Copyright 2005 Sakai Foundation Licensed under the
 * Educational Community License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may
 * obtain a copy of the License at
 *
 * http://www.osedu.org/licenses/ECL-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS"
 * BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
function initHierarchyForm(idFieldId, csrfFieldId, elBinding) {
    var idField = document.getElementById(idFieldId);
    var csrfField = document.getElementById(csrfFieldId);

    var ajaxUrl = idField.form.action;

    var callback = function(results) {
        console.log(results);
        console.log(results.EL[elBinding]);
    };

    var updater = RSF.getAJAXUpdater([idField, csrfField], ajaxUrl, [elBinding], callback);
    var nodes = document.getElementsByClassName("nodeXX");
    Array.prototype.forEach.call(nodes, function(el) {
        el.onclick = updater;
    });
}
