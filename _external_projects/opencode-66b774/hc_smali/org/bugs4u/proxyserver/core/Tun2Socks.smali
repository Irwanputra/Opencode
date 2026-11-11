.class public Lorg/bugs4u/proxyserver/core/Tun2Socks;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation build Landroid/annotation/TargetApi;
    value = 0xc
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/bugs4u/proxyserver/core/Tun2Socks$IProtectSocket;
    }
.end annotation


# static fields
.field private static final LOGD:Z = false

.field private static final TAG:Ljava/lang/String; = "Tun2Socks"

.field private static mDnsgwServerAddress:Ljava/lang/String;

.field private static mSocksServerAddress:Ljava/lang/String;

.field private static mUdpgwServerAddress:Ljava/lang/String;

.field private static mUdpgwTransparentDNS:Z

.field private static mVpnInterfaceFileDescriptor:Landroid/os/ParcelFileDescriptor;

.field private static mVpnInterfaceMTU:I

.field private static mVpnIpAddress:Ljava/lang/String;

.field private static mVpnNetMask:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .registers 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static Start(Landroid/os/ParcelFileDescriptor;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V
    .registers 8

    sput-object p0, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnInterfaceFileDescriptor:Landroid/os/ParcelFileDescriptor;

    sput p1, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnInterfaceMTU:I

    sput-object p2, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnIpAddress:Ljava/lang/String;

    sput-object p3, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnNetMask:Ljava/lang/String;

    sput-object p4, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mSocksServerAddress:Ljava/lang/String;

    sput-object p5, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mDnsgwServerAddress:Ljava/lang/String;

    sput-object p6, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mUdpgwServerAddress:Ljava/lang/String;

    sput-boolean p7, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mUdpgwTransparentDNS:Z

    if-eqz p0, :cond_27

    invoke-virtual {p0}, Landroid/os/ParcelFileDescriptor;->detachFd()I

    move-result p0

    sget p1, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnInterfaceMTU:I

    sget-object p2, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnIpAddress:Ljava/lang/String;

    sget-object p3, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mVpnNetMask:Ljava/lang/String;

    sget-object p4, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mSocksServerAddress:Ljava/lang/String;

    sget-object p5, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mDnsgwServerAddress:Ljava/lang/String;

    sget-object p6, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mUdpgwServerAddress:Ljava/lang/String;

    sget-boolean p7, Lorg/bugs4u/proxyserver/core/Tun2Socks;->mUdpgwTransparentDNS:Z

    invoke-static/range {p0 .. p7}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->runTun2Socks(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I

    :cond_27
    return-void
.end method

.method public static Stop()V
    .registers 0

    invoke-static {}, Lorg/bugs4u/proxyserver/core/Tun2Socks;->terminateTun2Socks()V

    return-void
.end method

.method public static logTun2Socks(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 3

    const-string p1, "Og<\u001ddfLglAboHdnAejL1>Icg@0=N4lJa"

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->xrc(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lxyz/easypro/ecrypt/utils/Crypt;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I

    return-void
.end method

.method private static native runTun2Socks(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)I
.end method

.method private static native terminateTun2Socks()V
.end method
