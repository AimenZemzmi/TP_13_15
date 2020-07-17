<?php

use PHPUnit\Framework\TestCase;

class UserTest extends TestCase
{

    private $user;

    public function __construct(User $user, string $name = null, array $data = [], $dataName = '')
    {
        $this->user = $user;
        parent::__construct($name, $data, $dataName);
    }

    public function TestFirstname()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());
        $user->setFirstname('');
        $this->assertEquals(false, $user->isValid());
        $user->setFirstname('aimen');
        $this->assertEquals(true, $user->isValid());
    }

    public function TestLastname()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());
        $user->setLastname('');
        $this->assertEquals(false, $user->isValid());
        $user->setLastname('zemzmi');
        $this->assertEquals(true, $user->isValid());
    }

    public function TestEmail()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('');
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('aimenDeTest');
        $this->assertEquals(false, $user->isValid());

        $user->setEmail('aimen.zemzmi@gmail.com');
        $this->assertEquals(true, $user->isValid());
    }

    public function TestAge()
    {
        $user = $this->user;
        $this->assertEquals(false, $user->isValid());
        $user->setAge(12);
        $this->assertEquals(false, $user->isValid());
        $user->setAge(20);
        $this->assertEquals(true, $user->isValid());
    }
}