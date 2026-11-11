.class public abstract Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ$げつ〴ぬぐ;
.super Landroid/os/Binder;
.source ""

# interfaces
.implements Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x409
    name = "\u3052\u3064\u3034\u306c\u3050"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lびぐびあび/げつ〴ぬぐ/げつ〴ぬぐ/〺つふすそ/げつ〴ぬぐ$げつ〴ぬぐ$げつ〴ぬぐ;
    }
.end annotation


# static fields
.field public static final synthetic 〺つふすそ:I


# direct methods
.method public constructor <init>()V
    .registers 2

    invoke-direct {p0}, Landroid/os/Binder;-><init>()V

    const-string v0, "android.support.v4.os.IResultReceiver"

    invoke-virtual {p0, p0, v0}, Landroid/os/Binder;->attachInterface(Landroid/os/IInterface;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public asBinder()Landroid/os/IBinder;
    .registers 1

    return-object p0
.end method

.method public onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z
    .registers 8

    const/4 v0, 0x1

    const-string v1, "android.support.v4.os.IResultReceiver"

    if-eq p1, v0, :cond_13

    const v2, 0x5f4e5446

    if-eq p1, v2, :cond_f

    invoke-super {p0, p1, p2, p3, p4}, Landroid/os/Binder;->onTransact(ILandroid/os/Parcel;Landroid/os/Parcel;I)Z

    move-result p1

    return p1

    :cond_f
    invoke-virtual {p3, v1}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return v0

    :cond_13
    invoke-virtual {p2, v1}, Landroid/os/Parcel;->enforceInterface(Ljava/lang/String;)V

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p1

    invoke-virtual {p2}, Landroid/os/Parcel;->readInt()I

    move-result p3

    if-eqz p3, :cond_29

    sget-object p3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    invoke-interface {p3, p2}, Landroid/os/Parcelable$Creator;->createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Landroid/os/Bundle;

    goto :goto_2a

    :cond_29
    const/4 p2, 0x0

    :goto_2a
    move-object p3, p0

    check-cast p3, Landroid/support/v4/os/ResultReceiver$〺つふすそ;

    invoke-virtual {p3, p1, p2}, Landroid/support/v4/os/ResultReceiver$〺つふすそ;->びえぁぜい(ILandroid/os/Bundle;)V

    return v0
.end method
