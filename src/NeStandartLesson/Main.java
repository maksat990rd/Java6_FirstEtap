package NeStandartLesson;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Начало дня!");
        Random ran = new Random();
        int polojitelniy = 0; int otricatelniy = 0; int ravenstvo = 0;
        if (ran.nextInt(50) % 2 == 1) {
            System.out.println("Поднимаюсь с кравати с левой ноги!");
            otricatelniy ++;
            if (ran.nextInt(1,10) < 8) {
                System.out.println("Падаю с кравати!");
                otricatelniy ++;
                if (ran.nextInt(1,12) < 9) {
                    System.out.println("Варю крепкий кофе!");
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колесо!");
                        polojitelniy++;
                        if (ran.nextInt(1,12) < 9) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3){
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздываю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на работу на автобусе!");
                            ravenstvo++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Добираюсь на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздываю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на своей машине на работу!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("Прихожу вовремя на работу!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздываю на работу!");
                            otricatelniy++;
                        }
                    }
                    ravenstvo ++;
                } else {
                    System.out.println("Готовлю плотный завтрак!");
                    polojitelniy ++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колесо!");
                        otricatelniy ++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу вовремя на работу!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу");
                                otricatelniy++;
                            }
                        }else {
                            System.out.println("Добираюсь на работу на автобусе!");
                            otricatelniy++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }

                    } else {
                        System.out.println("Добираюс на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("прихожу на работу вовремя!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                }
            } else {
                System.out.println("Пробежка по аллее!");
                polojitelniy++;
                if (ran.nextInt(1,12) < 9) {
                    System.out.println("Варю крепкий кофе!");
                    polojitelniy++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колесо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на работу на овтобусе!");
                            otricatelniy++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("Прихожу вовремя!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                } else {
                    System.out.println("Готовлю плотный завтрак!");
                    ravenstvo++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колусо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу вовремя на работу!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на автобусе!");
                            otricatelniy++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("прихожу вовремя!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                }
            }
        } else {
            System.out.println("Поднимаюсь с кровати с правой ноги!");
            polojitelniy++;
            if (ran.nextInt(1,6) < 5) {
                System.out.println("Пробежка по аллее!");
                ravenstvo++;
                if (ran.nextInt(1,12) < 9) {
                    System.out.println("Варю кофе!");
                    ravenstvo++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колесо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на работу на автобусе!");
                            ravenstvo++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу вовремя на работу!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("Прихожу вовремя на работу!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                } else {
                    System.out.println("готовлю плотный завтрак!");
                    ravenstvo++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колусо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на автобусе!");
                            ravenstvo++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу вовремя на работу!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на своем авто на работу!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("Прихожу вовремя на работу!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                }
            } else {
                System.out.println("Физ подготовка!");
                ravenstvo++;
                if (ran.nextInt(1,4) < 2) {
                    System.out.println("Готовлю плотный завтрак!");
                    ravenstvo++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колусо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("прихожу вовремя на работу!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на работу на автобусе!");
                            ravenstvo++;
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("Прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("прихожу на работу вовремя!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю на работу!");
                            otricatelniy++;
                        }
                    }
                } else {
                    System.out.println("Достаю вчерашний салат!");
                    ravenstvo++;
                    if (ran.nextInt(1,5) < 3) {
                        System.out.println("Спустило колесо!");
                        otricatelniy++;
                        if (ran.nextInt(1,8) < 3) {
                            System.out.println("Добираюсь на работу пешком!");
                            otricatelniy++;
                            if (ran.nextInt(1,8) < 3) {
                                System.out.println("Прихожу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        } else {
                            System.out.println("Добираюсь на работу на автобусе!");
                            if (ran.nextInt(1,2) < 2) {
                                System.out.println("прихожу на работу вовремя!");
                                polojitelniy++;
                            } else {
                                System.out.println("Опаздаю на работу!");
                                otricatelniy++;
                            }
                        }
                    } else {
                        System.out.println("Добираюсь на работу на своем авто!");
                        polojitelniy++;
                        if (ran.nextInt(1,8) < 6) {
                            System.out.println("Прихожу вовремя на работу!");
                            polojitelniy++;
                        } else {
                            System.out.println("Опаздаю ан работу!");
                            otricatelniy++;
                        }
                    }
                }
            }
        }
        System.out.println("Конец дня!");
        System.out.println("Положительных эмоций " + polojitelniy);
        System.out.println("отрицательных эмоций " + otricatelniy);
        System.out.println("Среднее значение дня " + ravenstvo);
        System.out.println("************************");
        if (polojitelniy > otricatelniy && polojitelniy > ravenstvo) {
            System.out.println("День выдался положительным!");
        } else if (otricatelniy > polojitelniy && otricatelniy > ravenstvo) {
            System.out.println("День выдался отрицательным!");
        } else {
            System.out.println("день выдался средним!");
        }
    }
}
