/*
 Copyright 2016 Goldman Sachs.
 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing,
 software distributed under the License is distributed on an
 "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 KIND, either express or implied.  See the License for the
 specific language governing permissions and limitations
 under the License.
 */

package com.gs.fw.common.mithra;



/**
 *  Exception issued when Reladomo detects possibly corrupt milestone records. For example
 *  two records with the same PK are open for a given timestamp.
 */
public class ReladomoCorruptMilestoneException extends MithraDatabaseException
{

    public ReladomoCorruptMilestoneException (String message)
    {
        super(message);
    }

    public ReladomoCorruptMilestoneException (String message, Throwable nestedException)
    {
        super(message, nestedException);
    }
}
