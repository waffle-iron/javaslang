/*     / \____  _    ______   _____ / \____   ____  _____
 *    /  \__  \/ \  / \__  \ /  __//  \__  \ /    \/ __  \   Javaslang
 *  _/  // _\  \  \/  / _\  \\_  \/  // _\  \  /\  \__/  /   Copyright 2014-2015 Daniel Dietrich
 * /___/ \_____/\____/\_____/____/\___\_____/_/  \_/____/    Licensed under the Apache License, Version 2.0
 */
package javaslang.algebra;

/*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*\
   G E N E R A T O R   C R A F T E D
\*-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-*/

import static org.assertj.core.api.Assertions.assertThat;

import javaslang.Function1;
import javaslang.Function7;
import javaslang.Tuple7;
import org.junit.Test;

public class Functor7Test {

    @Test
    public <T1, T2, T3, T4, T5, T6, T7> void shouldMapComponentsSeparately() {
        final Functor7<T1, T2, T3, T4, T5, T6, T7> functor = new Functor7<T1, T2, T3, T4, T5, T6, T7>() {
            @SuppressWarnings("unchecked")
            @Override
            public <U1, U2, U3, U4, U5, U6, U7> Functor7<U1, U2, U3, U4, U5, U6, U7> map(Function7<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super T6, ? super T7, Tuple7<? extends U1, ? extends U2, ? extends U3, ? extends U4, ? extends U5, ? extends U6, ? extends U7>> f) {
                return (Functor7<U1, U2, U3, U4, U5, U6, U7>) this;
            }
        };
        final Functor7<T1, T2, T3, T4, T5, T6, T7> actual = functor.map(Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity(), Function1.identity());
        assertThat(actual).isNotNull();
    }
}