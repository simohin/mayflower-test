package ru.simohin.mayflower.test.util

inline fun <reified E : Enum<E>> ofValueOrThrow(value: String) =
    enumValues<E>().firstOrNull { it.name.equals(value, true) }
        ?: throw RuntimeException("Unexpected ${E::class.simpleName} $value")