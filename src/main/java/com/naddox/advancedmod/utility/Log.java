/*
 * This project is 100% open source. Use anything within its code in 
 * anyway you like. I only ask that you give credit where it is due.
 *
 * Thanks.
 */
package com.naddox.advancedmod.utility;

import com.naddox.advancedmod.reference.Reference;
import cpw.mods.fml.common.FMLLog;
import org.apache.logging.log4j.Level;

/*
 *@author Naddox <calebdk09@gmail.com>
 */
public class Log
{
    public static void log(Level logLevel, Object object)
    {
        FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
    }

    public static void all(Object object)
    {
        log(Level.ALL, object);
    }

    public static void debug(Object object)
    {
        log(Level.DEBUG, object);
    }

    public static void error(Object object)
    {
        log(Level.ERROR, object);
    }

    public static void fatal(Object object)
    {
        log(Level.FATAL, object);
    }

    public static void info(Object object)
    {
        log(Level.INFO, object);
    }

    public static void off(Object object)
    {
        log(Level.OFF, object);
    }

    public static void trace(Object object)
    {
        log(Level.TRACE, object);
    }

    public static void warn(Object object)
    {
        log(Level.WARN, object);
    }
}
