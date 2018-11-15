// Generated by ast.js
/**
 * Copyright 2018 Shape Security, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.shapesecurity.shift.es2017.ast;

import javax.annotation.Nonnull;
import com.shapesecurity.functional.data.HashCodeBuilder;

public class DoWhileStatement extends IterationStatement {
    @Nonnull
    public final Expression test;


    public DoWhileStatement (@Nonnull Statement body, @Nonnull Expression test) {
        super(body);
        this.test = test;
    }


    @Override
    public boolean equals(Object object) {
        return object instanceof DoWhileStatement && this.body.equals(((DoWhileStatement) object).body) && this.test.equals(((DoWhileStatement) object).test);
    }


    @Override
    public int hashCode() {
        int code = HashCodeBuilder.put(0, "DoWhileStatement");
        code = HashCodeBuilder.put(code, this.body);
        code = HashCodeBuilder.put(code, this.test);
        return code;
    }

}
