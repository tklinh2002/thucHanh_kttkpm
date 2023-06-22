package org.example;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

public class Main {
    public static void main(String[] args) {
        //Connecting to Redis server on localhost
        JedisPool jedisPool = new JedisPool("127.0.0.1",6379);
        Jedis  jedis = jedisPool.getResource();
        jedis.set("abc","tranKhanhLinh");


    }
}