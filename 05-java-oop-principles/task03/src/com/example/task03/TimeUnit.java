package com.example.task03;
/**
 * Интервал в миллисекундах
 */
public class Milliseconds implements TimeUnit
{
    private final long amount;

    public Milliseconds(long amount)
    {
        if (amount < 0)
            throw new IllegalArgumentException("amount must be >= 0");
        this.amount = amount;
    }

    @Override
    public long toMillis()
    {
        return amount;
        return this.amount;
    }

    @Override
    public long toSeconds()
    {
        return amount / 1000;
        return Math.round(this.amount / 1000d);
    }

    @Override
    public long toMinutes()
    {
        return amount / 1000 * 60;
        return Math.round(this.amount / 60000d);
    }

    @Override
    public long toHours()
    {
        return Math.round(this.amount / 3600000d);
    }
}
