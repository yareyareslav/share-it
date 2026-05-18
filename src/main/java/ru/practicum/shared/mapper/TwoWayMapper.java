package ru.practicum.shared.mapper;

public interface TwoWayMapper<D, P> {
    D toData(P p);

    P toPresentation(D d);
}
