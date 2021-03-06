/**
 * The MIT License
 *
 *   Copyright (c) 2016, Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 *
 *   Permission is hereby granted, free of charge, to any person obtaining a copy
 *   of this software and associated documentation files (the "Software"), to deal
 *   in the Software without restriction, including without limitation the rights
 *   to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *   copies of the Software, and to permit persons to whom the Software is
 *   furnished to do so, subject to the following conditions:
 *
 *   The above copyright notice and this permission notice shall be included in
 *   all copies or substantial portions of the Software.
 *
 *   THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *   IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *   FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *   AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *   LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *   OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *   THE SOFTWARE.
 */
package io.github.benas.randombeans;

import lombok.Value;

import java.lang.annotation.Annotation;
import java.util.HashSet;
import java.util.Set;

/**
 * Defines attributes used to identify fields.
 *
 * @param <T> The declaring class type
 * @param <F> The field type
 * @author Mahmoud Ben Hassine (mahmoud.benhassine@icloud.com)
 */
@Value
public class FieldDefinition<T, F> {

    private final String name;

    private final Class<F> type;

    private final Class<T> clazz;

    private final Set<Class <? extends Annotation>> annotations;

    /**
     * Create a new {@link FieldDefinition}.
     *
     * @param name  the field name
     * @param type  the filed type
     * @param clazz the declaring class type
     */
    public FieldDefinition(String name, Class<F> type, Class<T> clazz) {
        this(name, type, clazz, new HashSet<>());
    }

    /**
     * Create a new {@link FieldDefinition}.
     *
     * @param name  the field name
     * @param type  the filed type
     * @param clazz the declaring class type
     */
    public FieldDefinition(String name, Class<F> type, Class<T> clazz, Set<Class <? extends Annotation>> annotations) {
        this.name = name;
        this.type = type;
        this.clazz = clazz;
        this.annotations = annotations;
    }

    public String getName() {
        return name;
    }

    public Class<F> getType() {
        return type;
    }

    public Class<T> getClazz() {
        return clazz;
    }

    public Set<Class<? extends Annotation>> getAnnotations() {
        return annotations;
    }
}
