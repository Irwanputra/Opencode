.class public Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;
.super Landroid/view/View$BaseSavedState;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SavedState"
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public 〺つふすそ:I


# direct methods
.method public static constructor <clinit>()V
    .registers 1

    new-instance v0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState$げつ〴ぬぐ;

    invoke-direct {v0}, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState$げつ〴ぬぐ;-><init>()V

    sput-object v0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$げつ〴ぬぐ;)V
    .registers 3

    .line 1
    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcel;)V

    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result p1

    iput p1, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;->〺つふすそ:I

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcelable;)V
    .registers 2

    invoke-direct {p0, p1}, Landroid/view/View$BaseSavedState;-><init>(Landroid/os/Parcelable;)V

    return-void
.end method


# virtual methods
.method public writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    invoke-super {p0, p1, p2}, Landroid/view/View$BaseSavedState;->writeToParcel(Landroid/os/Parcel;I)V

    iget p2, p0, Lcom/codetroopers/betterpickers/widget/UnderlinePageIndicatorPicker$SavedState;->〺つふすそ:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    return-void
.end method
