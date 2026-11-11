.class public Landroidx/versionedparcelable/ParcelImpl;
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


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Landroidx/versionedparcelable/ParcelImpl;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final 〺つふすそ:Lづざかべべ/ざっざへづ/くし〴〺ぅ;


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Landroidx/versionedparcelable/ParcelImpl$げつ〴ぬぐ;

    invoke-direct {v0}, Landroidx/versionedparcelable/ParcelImpl$げつ〴ぬぐ;-><init>()V

    sput-object v0, Landroidx/versionedparcelable/ParcelImpl;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Lづざかべべ/ざっざへづ/〺つふすそ;

    invoke-direct {v0, p1}, Lづざかべべ/ざっざへづ/〺つふすそ;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {v0}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->おぐぴう〸ず()Lづざかべべ/ざっざへづ/くし〴〺ぅ;

    move-result-object p1

    iput-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->〺つふすそ:Lづざかべべ/ざっざへづ/くし〴〺ぅ;

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

    new-instance p2, Lづざかべべ/ざっざへづ/〺つふすそ;

    invoke-direct {p2, p1}, Lづざかべべ/ざっざへづ/〺つふすそ;-><init>(Landroid/os/Parcel;)V

    iget-object p1, p0, Landroidx/versionedparcelable/ParcelImpl;->〺つふすそ:Lづざかべべ/ざっざへづ/くし〴〺ぅ;

    invoke-virtual {p2, p1}, Lづざかべべ/ざっざへづ/げつ〴ぬぐ;->ぶでにく〼〳(Lづざかべべ/ざっざへづ/くし〴〺ぅ;)V

    return-void
.end method
