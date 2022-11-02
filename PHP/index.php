<?php

require_once("car.php");
require_once("uberX.php");
require_once("account.php");

$uberX = new UberX("SEE656", new Account("Andy Nox", "YUK646"), "Chevrolet", "Spark");

$uberX->printDataCar();

$uberPool = new UberX("YTB656", new Account("Andy Floor", "RTH646"), "Chevrolet", "Neo");

$uberPool->printDataCar();

?>