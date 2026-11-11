.class public Landroid/support/v4/os/ResultReceiver;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "BanParcelableUsage"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroid/support/v4/os/ResultReceiver$〺つふすそ;
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroid/support/v4/os/ResultReceiver;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroid/support/v4/os/ResultReceiver$げつ〴ぬぐ;

    invoke-direct {v0}, Landroid/support/v4/os/ResultReceiver$げつ〴ぬぐ;-><init>()V

    sput-object v0, Landroid/support/v4/os/ResultReceiver;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readStrongBinder()Landroid/os/IBinder;

    move-result-object p1

    .line 1
    sget v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ$げつ〴ぬぐ;->〺つふすそ:I

    if-nez p1, :cond_d

    const/4 p1, 0x0

    goto :goto_23

    :cond_d
    const-string v0, "android.support.v4.os.IResultReceiver"

    invoke-interface {p1, v0}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    move-result-object v0

    if-eqz v0, :cond_1d

    instance-of v1, v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    if-eqz v1, :cond_1d

    move-object p1, v0

    check-cast p1, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    goto :goto_23

    :cond_1d
    new-instance v0, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;

    invoke-direct {v0, p1}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;-><init>(Landroid/os/IBinder;)V

    move-object p1, v0

    .line 2
    :goto_23
    iput-object p1, p0, Landroid/support/v4/os/ResultReceiver;->〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    return-void
.end method


# virtual methods
.method public describeContents()I
    .registers 2

    const/4 v0, 0x0

    return v0
.end method

.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    monitor-enter p0

    :try_start_1
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    if-nez p2, :cond_c

    new-instance p2, Landroid/support/v4/os/ResultReceiver$〺つふすそ;

    invoke-direct {p2, p0}, Landroid/support/v4/os/ResultReceiver$〺つふすそ;-><init>(Landroid/support/v4/os/ResultReceiver;)V

    iput-object p2, p0, Landroid/support/v4/os/ResultReceiver;->〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    :cond_c
    iget-object p2, p0, Landroid/support/v4/os/ResultReceiver;->〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    invoke-interface {p2}, Landroid/os/IInterface;->asBinder()Landroid/os/IBinder;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    monitor-exit p0

    return-void

    :catchall_17
    move-exception p1

    monitor-exit p0
    :try_end_19
    .catchall {:try_start_1 .. :try_end_19} :catchall_17

    throw p1
.end method

.method public ぁごぐすすぃ(ILandroid/os/Bundle;)V
    .registers 4

    iget-object v0, p0, Landroid/support/v4/os/ResultReceiver;->〺つふすそ:Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;

    if-eqz v0, :cond_7

    :try_start_4
    invoke-interface {v0, p1, p2}, Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;->びえぁぜい(ILandroid/os/Bundle;)V
    :try_end_7
    .catch Landroid/os/RemoteException; {:try_start_4 .. :try_end_7} :catch_7

    :catch_7
    :cond_7
    return-void
.end method

.method public なぎぱいぢぎ(ILandroid/os/Bundle;)V
    .registers 3

    return-void
.end method
