package com.example.task03;

public class Minutes implements TimeUnit
{

    private final long amount;

    public Minutes(long amount)
    {
        // TODO: реализовать
        throw new UnsupportedOperationException();
        if (amount < 0)
            throw new IllegalArgumentException("amount must be >= 0");
        this.amount = amount;
    }

    @Override
    public long toMillis()
    {
        // TODO: реализовать
        throw new UnsupportedOperationException();
        return this.amount * 60000;
    }

    @Override
    public long toSeconds()
    {
        // TODO: реализовать
        throw new UnsupportedOperationException();
        return this.amount * 60;
    }

    @Override
    public long toMinutes()
    {
        // TODO: реализовать
        throw new UnsupportedOperationException();
        return this.amount;
    }

    @Override
    public long toHours()
    {
        return Math.round(this.amount / 60d);
    }
}